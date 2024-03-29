# Steps to edit Kernel

1. Edit Kernel-Partial
  1. Open in UML Editor
  2. If additional UML elements are needed, then create an empty skeleton as placeholder
  3. Save
2. Assign XMI-IDs manually, iff new elements where added
  1. Open Kernel-Partial.uml with text editor
  2. search and replace xmi:id to be replaced with name of element -> this ensures stable references in the future.
    - NOTE: this has to be done for the Kernel-Partial.notation file as well!
	- HINT: use file search and replace to find all IDs in related files
  3. Save
3. Copy Kernel-Partial.uml to Kernel.uml
4. Perform Package Merge
  1. Open Kernel.uml in PackageMerge capable editor (e.g. Eclipse UML Model Editor)
  2. Perform Package Merge
  3. Remove Package Imports to merged packages -> reduces dependencies and makes it self-sufficient
  4. Save