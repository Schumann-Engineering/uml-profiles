# Source
github: eclipse-uml2/uml2
folder: plugins\org.eclipse.uml2.uml\model

# Modifications
- replaced http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi#xxx with ECore types
	- http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi#Boolean -> pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EBoolean
	- http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi#Integer -> pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EInteger
	- http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi#String -> pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EString
	- http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi#UnlimitedNatural -> pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#ELong