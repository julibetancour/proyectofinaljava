public class producto {
        private String id;
        private String nombre;
        private String descripcion;
        private double precio;
        private int cantidadEnStock;



        public producto(String id, String nombre, String descripcion, double precio, int cantidadEnStock) {
            this.id = id;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
            this.cantidadEnStock = cantidadEnStock;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getnombre() {
            return nombre;
        }

        public void setnombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getCantidadEnStock() {
            return cantidadEnStock;
        }

        public void setCantidadEnStock(int cantidadEnStock) {
            this.cantidadEnStock = cantidadEnStock;
        }


        public void actualizarCantidadEnStock(int cantidad) {
            this.cantidadEnStock += cantidad;
        }


    }
}
