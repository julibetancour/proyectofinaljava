import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private String idPedido;
    private ArrayList<Producto> productosSolicitados;
    private String estado;
    private Date fechaHora;

    // Constructor
    public Pedido(String idPedido, Date fechaHora) {
        this.idPedido = idPedido;
        this.productosSolicitados = new ArrayList<>();
        this.estado = "pendiente";
        this.fechaHora = fechaHora;
    }

    // Getters y Setters
    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public ArrayList<Producto> getProductosSolicitados() {
        return productosSolicitados;
    }

    public void setProductosSolicitados(ArrayList<Producto> productosSolicitados) {
        this.productosSolicitados = productosSolicitados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    // Método para agregar productos al pedido
    public void agregarProducto(Producto producto) {
        this.productosSolicitados.add(producto);
    }

    // Método para cambiar el estado del pedido
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }