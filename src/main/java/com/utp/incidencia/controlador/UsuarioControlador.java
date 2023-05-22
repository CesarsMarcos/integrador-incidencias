/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.incidencia.controlador;

import com.utp.incidencia.modelo.Rol;
import com.utp.incidencia.modelo.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Cesar
 */
public class UsuarioControlador {

    List<Usuario> lista;

    public List<Usuario> cargarUsuarios() {
        lista = Arrays.asList(new Usuario("CESAR", "MARCOS", "CMARCOS", "12345", Rol.ADMIN),
                                new Usuario("USUARIO", "USUARIO", "USUARIO1", "12345", Rol.USUARIO));
        return lista;
    }

    public Optional<Usuario> validarUsuario(String username, String password) {

        List<Usuario> usuarios = this.cargarUsuarios();

        Optional<Usuario> usuario = usuarios.stream()
                .filter(x -> x.getUsuario().equalsIgnoreCase(username) && x.getPassword().equalsIgnoreCase(password))
                .findAny();
        return usuario;
    }

    public String agregarUsuario(Usuario usuario) {
        List<Usuario> usuarios = this.cargarUsuarios();
        usuarios.add(usuario);
        return "Usuario Registrado";
    }

   

}
