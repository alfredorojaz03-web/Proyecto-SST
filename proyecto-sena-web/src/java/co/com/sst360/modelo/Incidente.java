package co.com.sst360.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Incidente {

    private int idIncidente;
    private String tipoEvento;
    private String codigo;
    private LocalDate fecha;
    private LocalTime hora;
    private String lugar;
    private String area;
    private String descripcion;
    private String estado;

    public Incidente() {
    }

    public Incidente(String tipoEvento, String codigo, LocalDate fecha, LocalTime hora,
                     String lugar, String area, String descripcion, String estado) {
        this.tipoEvento = tipoEvento;
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.area = area;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
