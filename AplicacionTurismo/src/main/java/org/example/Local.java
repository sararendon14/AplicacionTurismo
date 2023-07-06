package org.example;

public class Local {

        private Integer id;
        private Integer nit;
        private  String nombre;
        private  Integer ubicacion;

        public Local() {
        }

        public Local(Integer id, Integer nit, String nombre, Integer ubicacion) {
            this.id = id;
            this.nit = nit;
            this.nombre = nombre;
            this.ubicacion = ubicacion;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getNit() {
            return nit;
        }

        public void setNit(Integer nit) {
            this.nit = nit;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Integer getUbicacion() {
            return ubicacion;
        }

        public void setUbicacion(Integer ubicacion) {
            this.ubicacion = ubicacion;
        }
    }


