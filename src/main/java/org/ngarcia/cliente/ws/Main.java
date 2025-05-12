package org.ngarcia.cliente.ws;

import org.ngarcia.webapp.jaxws.services.Curso;
import org.ngarcia.webapp.jaxws.services.CursoServiceWsImplService;
import org.ngarcia.webapp.jaxws.services.CursoServicioWs;

public class Main {
    public static void main(String[] args) {

        CursoServicioWs service = new CursoServiceWsImplService().getCursoServiceWsImplPort();

        Curso curso = new Curso();
        curso.setNombre("react");
        curso.setDescripcion("react js");
        curso.setInstructor("andrés");
        curso.setDuracion(50D);
        Curso newCurso = service.guardar(curso);
        System.out.println("NUEVO Curso: " + newCurso.getNombre());

        service.listar().forEach(c-> System.out.println(c.getNombre()));

    }
}