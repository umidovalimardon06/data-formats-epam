# LESSON 1: XML Basics

## 1. What is XML?

**XML (Extensible Markup Language)** is a language used to store and exchange data in a structured and human-readable format.

### Meaning of XML

* **Extensible** – can be extended according to user needs
* **Markup** – uses tags to mark and structure data
* **Language** – a standard way to represent information

---

## 2. XML Tags

XML uses tags to define and organize data.

### Types of XML Tags

1. **Begin (Start) Tag**

   ```xml
   <tag>
   ```
2. **End Tag**

   ```xml
   </tag>
   ```
3. **Empty Tag**

   ```xml
   <tag />
   ```

---

## 3. XML Declaration (Optional)

The XML declaration appears at the top of an XML document and defines version and encoding.

```xml
<?xml version="1.0" encoding="UTF-8"?>
```

---

## 4. XML Elements

Elements are the main building blocks of XML documents.

### Example

```xml
<customer>        <!-- root element -->
    <name>Carl</name>    <!-- nested element -->
    <phone>+99899321...</phone>
</customer>
```

* **Root element**: The top-level element of the XML document
* **Nested elements**: Elements inside another element

---

## 5. CDATA Sections

**CDATA (Character Data)** is used to include raw text that should not be parsed as XML.

```xml
<![CDATA[ raw-text-here ]]>
```

Used when text contains special characters like `<`, `>`, or `&`.

---

## 6. XML Attributes

Attributes provide additional information about elements.

### Example

```xml
<book isbn="978-1234567890">XML Basics</book>
```

### Key Points

* Attributes describe **properties of elements**
* Attribute order does **not** matter
* Attribute values must be enclosed in quotes

---

## 7. XML Schemas and Namespaces

Namespaces are used to avoid name conflicts in XML documents.

### Example

```xml
xmlns:cust="http://www.example.org/"
```

Schemas define the structure and rules of an XML document.

---

## 8. Encoding

Encoding specifies how characters are represented in XML.

Common encodings:

* **UTF-8**
* **UTF-16**

---

## 9. XML Comments

Comments are used to add notes inside XML files.

```xml
<!-- This is a comment -->
```

---

## 10. XML Entities

Entities represent special characters in XML.

Examples:

* `&amp;` → &
* `&lt;` → <
* `&gt;` → >

---

## 11. XML Processing APIs

XML processing APIs differ based on performance and usage.

### Evaluation Criteria

* Speed
* Memory usage
* Ease of programming

### Types of XML Processing APIs

1. **Tree-based** (e.g., DOM)

    * Loads entire XML into memory
    * Easier to navigate and modify
    * Uses more memory

2. **Streaming** (e.g., SAX, StAX)

    * Reads XML sequentially
    * Uses less memory
    * Faster for large XML files

3. **Binding-style** (e.g., JAXB)

    * Maps XML directly to objects
    * Easier for application development

---




