/*
 * generated by Xtext
 */
package org.xtext.example.boxes.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import boxes.Box

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BoxesDslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (box : resource.allContents.toIterable.filter(typeof(Box))) {
			fsa.generateFile("test/" + box.name + ".rpt", box.report)
		}
		
		for (box : resource.allContents.toIterable.filter(typeof(Box))) {
			fsa.generateFile("anotherTest/" + box.name + ".rpt", box.report2)
		}
	}
	
	def CharSequence report(Box box) {
		'''
		Box Report: «box.name»
			«IF box.ports.size != 0»
			Ports: 
				«FOR port : box.ports»
				«port.name»
				«ENDFOR»
			«ENDIF»
		'''
	}
	
	def CharSequence report2(Box box) {
		'''
		Format2: 
		Box Report: «box.name»
			«IF box.ports.size != 0»
			Ports:
				«FOR port : box.ports»
				«port.name»
				«ENDFOR»
			«ENDIF»
			«IF box.boxInstances.size != 0»
			BoxInstances: 
				«FOR boxInstance : box.boxInstances»
				«boxInstance.instanceName» (instance of «boxInstance.boxRef.name»)
				«ENDFOR»
			«ENDIF»
		'''			
	}
	
	
}
