# Jackson ObjectMapper

## What it does

Jackson `ObjectMapper` converts between **JSON** and **Java objects**.

* **Deserialization** → JSON ➜ Java object
* **Serialization** → Java object ➜ JSON

---

## Mapping rules

* Jackson maps **by property**, not by field
* Property names are derived from **getters/setters**
* `getX()` / `setX()` ➜ `x`
* **Booleans are special**: `isX()` ➜ `x`

---

## Deserialization sources

You can deserialize JSON from:

1. `String`
2. `Reader`
3. `JsonNode`
4. `URL`
5. `InputStream`

---

## Serialization targets

You can serialize Java objects to:

1. **JSON file** → `writeValue(...)`
2. **String** → `writeValueAsString(...)`

---

## Key takeaway

> Jackson follows JavaBean conventions. If names don’t match, use `@JsonProperty` to be explicit.
