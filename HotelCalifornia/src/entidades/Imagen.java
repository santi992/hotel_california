/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.swing.ImageIcon;

/**
 *
 * @author SANTIAGONB
 */
public class Imagen {

    private int idImagen;

    private String ruta;

    private ImageIcon imagen;

    public Imagen() {
    }

    public Imagen(int idImagen, String ruta) {
        this.idImagen = idImagen;
        this.ruta = ruta;
        this.imagen = new ImageIcon(getClass().getResource(ruta));
    }

    public Imagen(String ruta) {
        this.ruta = ruta;
        this.imagen = new ImageIcon(getClass().getResource(ruta));
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

}
