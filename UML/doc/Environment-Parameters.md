```
# Directories
DIR_SCHEMA       				= schema


# Comments
COMMENT_ONE_LINE                = //
COMMENT_MULTI_LINE_START        = /*
COMMENT_MULTI_LINE              = *
COMMENT_MULTI_LINE_END          = */


# Behaviour
DROP_BEFORE_CREATE				= true


# Syntax
# ... Prefix for uml classes. Format TYPE_PREFIX_[name] = <prefix>
TYPE_PREFIX_Class               = C
TYPE_PREFIX_Interface			= I
TYPE_PREFIX_Enumeration			= E

# ... Keywords in the target language. Format KEYWORD_[name] = [true|yes|1|on]
# [none]

# ... Primitive data types and their translation. Format PRIMITIVE_TYPE_[name] = <primitive type in target language>
PRIMITIVE_TYPE_Boolean 			= boolean
PRIMITIVE_TYPE_Integer          = integer
PRIMITIVE_TYPE_UnlimitedNatural = integer
PRIMITIVE_TYPE_String 			= text
PRIMITIVE_TYPE_UUID 			= UUID


# ... Divider for namespaces. E.g. "." => A.B.C / "::" => A::B::C
NAMESPACE_DIVIDER               = .

# ... collapsable regions
#REGION_END				        = 
#REGION_START			        = 



DEFAULT_VALUE_BOOLEAN           = false
DEFAULT_VALUE_CLASS             = NULL
DEFAULT_VALUE_INTEGER           = 0
DEFAULT_VALUE_LIST              = N/A
DEFAULT_VALUE_SET               = N/A 
DEFAULT_VALUE_STRING            = ""
DEFAULT_VALUE_UINTEGER          = 0
DIR_PREFIX                      = Model
DIR_TO_MODEL                    = Model
HAS_DEFAULT_VALUE_LIST          = false
HAS_DEFAULT_VALUE_SET           = false 
LANGUAGE				        = cpp
LIST_TEMPLATE					= std::vector
NULL_VALUE                      = NULL
OPERATION_ABSTRACT_MODIFIER     = virtual
PROPERTY_DIVIDER                = .
PROPERTY_PREFIX                 = m_
SET_TEMPLATE					= std::set

TYPE_PREFIX_CLASS_LIST			=
TYPE_SUFFIX_CLASS_LIST			= Pointer
TYPE_PREFIX_CLASS_SET			=
TYPE_SUFFIX_CLASS_SET			= Pointer
VISIBILITY_PACKAGE              = package:
VISIBILITY_PRIVATE              = private: 
VISIBILITY_PROTECTED            = protected:
VISIBILITY_PUBLIC               = public:
```