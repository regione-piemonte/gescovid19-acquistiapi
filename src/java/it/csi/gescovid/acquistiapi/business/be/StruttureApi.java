/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.gescovid.acquistiapi.business.be;

import it.csi.gescovid.acquistiapi.dto.*;


import it.csi.gescovid.acquistiapi.dto.Errore;
import it.csi.gescovid.acquistiapi.dto.ModelStruttura;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/strutture")




public interface StruttureApi  {
   
    @GET
    
    
    @Produces({ "application/json" })

    public Response struttureGet(@HeaderParam("Shib-Identita-CodiceFiscale") String shibIdentitaCodiceFiscale,@HeaderParam("X-Applicazione-Codice") String xApplicazioneCodice,@HeaderParam("X-Request-Id") String xRequestId, @QueryParam("ente") String ente,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest );
}
