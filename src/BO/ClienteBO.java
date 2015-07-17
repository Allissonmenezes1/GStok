
package BO;

import DAO.ClienteDAO;
import PO.Cliente;

public class ClienteBO {
    private ClienteDAO c;
    
    public ClienteBO(){
        c = new ClienteDAO();
    }
    
    public boolean cadastrarCliente(Cliente cliente){
    
        if(c.getCliente(cliente.getCPF()) != null)
            return false;
        
        return c.inserirCliente(cliente);
    }
}
