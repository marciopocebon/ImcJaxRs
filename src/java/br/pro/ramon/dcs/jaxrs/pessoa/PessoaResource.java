package br.pro.ramon.dcs.jaxrs.pessoa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pessoas")
public class PessoaResource {

    @GET
    @Path("/{nome}/imc")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getImc(@PathParam("nome") String nome, @QueryParam("peso") double peso, @QueryParam("altura") double altura) {
        Pessoa pessoa = new Pessoa(nome, peso, altura);
        Imc imc = pessoa.getImc();
        return Response.ok(imc).build();
    }

}
