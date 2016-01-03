/*
 * generated by Xtext
 */
package org.xtext.example.boxes.generator;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class Main {
	
	public static void main(String[] args) {
		if (args.length==0) {
			System.err.println("Aborting: no path to EMF resource provided!");
			return;
		}
		Injector injector = new org.xtext.example.boxes.BoxesDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		main.runGenerator(args);
	}
	
	@Inject 
	private Provider<ResourceSet> resourceSetProvider;
	
	@Inject
	private IResourceValidator validator;
	
	@Inject
	private IGenerator generator;
	
	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String [] args) {
		// load the resource
		ResourceSet set = resourceSetProvider.get();
		
		// Load each resource from the command line into the ResourceSet
		for (String fileName : args) {
			set.getResource(URI.createURI(fileName), true);
		}
		
		for (Resource resource : set.getResources()) {
			// validate the resource
			List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			if (!list.isEmpty()) {
				for (Issue issue : list) {
					System.err.println(issue);
				}
				return;
			}
		}
		
		// configure and start the generator
		fileAccess.setOutputPath("src-gen/");
		
		for (Resource resource : set.getResources()) {
			generator.doGenerate(resource, fileAccess);
		}
		
		System.out.println("Code generation finished.");
	}
}
