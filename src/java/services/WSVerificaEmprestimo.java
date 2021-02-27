package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Leonardo
 */
@WebService(serviceName = "WSVerificaEmprestimo")
public class WSVerificaEmprestimo {

    @WebMethod(operationName = "WSVerificaEmprestimo")
    public boolean operation(@WebParam(name = "Salario") double Salario, @WebParam(name = "Emprestimo") double Emprestimo, @WebParam(name = "Parcelas") int Parcelas) {
        if ((Emprestimo / Parcelas) > (0.3 * Salario)) {
            return false;
        }
        return true;
    }

}
