# YAML (YAML Ain't Markup Language)

## Overview

**YAML (YAML Ain't Markup Language)** is a human-readable data input format mainly used for writing configuration files. It is designed to be simple, clean, and easy to understand.

---

## Purpose

YAML is commonly used to define **configuration data** for applications and systems. Unlike JSON or XML, YAML relies on **indentation** instead of brackets or tags to represent structure.

---

## Key Characteristics

* Uses **indentation** to define hierarchy
* Does not require brackets `{}` or tags `<>`
* Easy to read and write
* Widely used in modern development tools
* **Supports comments** using `#`

---

## Common Use Cases

YAML is mainly used in:

1. **Docker Compose**
2. **Kubernetes**
3. **Application Configuration**

    * Spring Boot
    * Django

---

## Example YAML Configuration

```yaml
server:
  port: 8080

spring:
  datasource:
    url: jdbc:postgresql://db:5432/postgres
    username: my
    password: 123

jpa:
  hibernate:
    ddl-auto: update
  show-sql: true
```

---

## Summary

YAML is a clean and powerful configuration format that emphasizes readability and simplicity. It is especially popular in DevOps tools and backend application configuration.
