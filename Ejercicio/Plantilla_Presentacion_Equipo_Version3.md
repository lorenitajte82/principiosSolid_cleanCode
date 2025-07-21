# Presentación de Equipo

## 1. Problemas identificados
- Ejemplo: Lógica de negocio en el controlador.
- Ejemplo: 
- Ejemplo: 

## 2. Cambios realizados y justificación
- Creamos ProductService con lógica de negocio.
- Usamos 
- Extraímos validac
- Aplicamos
- Renombramos 

## 3. Fragmentos clave antes/después

**Antes:**
```java
public ResponseEntity<?> addProduct(@RequestBody Map<String, Object> product) { ... }
```

**Después:**
```java
public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO product) { ... }
```

## 4. Reflexión final
- ¿Qué aprendimos?
- ¿Qué haríamos diferente la próxima vez?
