@RestController
public class ProductController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/products")
    public List<Map<String, Object>> getAll() {
        return jdbcTemplate.queryForList("SELECT * FROM product");
    }

    @PostMapping("/products")
    public ResponseEntity<?> addProduct(@RequestBody Map<String, Object> product) {
        if (product.get("name") == null || product.get("price") == null) {
            return ResponseEntity.badRequest().body("Invalid data");
        }
        jdbcTemplate.update("INSERT INTO product (name, price) VALUES (?, ?)",
            product.get("name"), product.get("price"));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/products/{id}")
    public Map<String, Object> getProduct(@PathVariable int id) {
        return jdbcTemplate.queryForMap("SELECT * FROM product WHERE id = ?", id);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        jdbcTemplate.update("DELETE FROM product WHERE id = ?", id);
        return ResponseEntity.ok().build();
    }

    // Métodos de validación, logging y lógica de negocio mezclados aquí...
}