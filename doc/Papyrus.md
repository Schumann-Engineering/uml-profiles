# Compartment types

## found in documentation
- kind
	- attributes
	- symbol
	- internalstructure
- type
	- StereotypeBrace
	- StereotypeCompartment
	- compartment_shape_display

## guessed
* kind
	* packagedelements

## candidates
ClassAttributeCompartmentEditPart
ClassOperationCompartmentEditPart
ClassNestedClassifierCompartmentEditPart

# Label types

```
Connector > Label[kind=SourceMultiplicity],
Connector > Label[kind=TargetMultiplicity] {
	visible: false;
}
```
  
> In general, you can find the "kind" of Labels by selecting a Connector (Or any other edge, e.g. Association) in a Diagram, then select Filter > Show/Hide Labels. The "kind" of the label is the value in the "Label Role" column

(source: https://www.eclipse.org/forums/index.php?t=msg&th=1092502&goto=1784604&)

# custom shapes

## CSS
```
Component > Compartment[type=compartment_shape_display] {
	visible: true;
	showTitle: false;
}

Component {
	maintainSymbolRatio: false;
	fillColor: white;
	displayBorder: false;
	displayName: true;
	followSVGSymbol: true;
}
```
## SVG
add a rect or path or similar, with specific label:
```
id="PapyrusLabel"
```
Papyrus will take this to show the label of a shape inside this part of the SVG. 😎

# Profile properties

💡 IDEA: stereotype has property. We want to change icons based on that property.

```
Component[property1="<value>"] {

}
```
where "property1" is the property of a stereotype

❓ what happens with duplicated property names? 🤔
# Profiles

## Stereotypes

### Icons and Expression
> From what I read in ImageUtil class (used to retrieve this image), this field is only valuable to test an enumeration value. It can not be used to elaborate a more complex boolean expression.

[source: eclipse.org/forums](https://www.eclipse.org/forums/index.php/t/1109870/)