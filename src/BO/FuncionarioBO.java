
package BO;
import DAO.FuncionarioDAO;
import PO.Funcionario;

public class FuncionarioBO {
    private FuncionarioDAO f;
    
    public FuncionarioBO(){
        f = new FuncionarioDAO();
    }
    
    public Funcionario login(int cpf, String senha){
        
        Funcionario func = f.getFuncionario(cpf);
        
        if(func == null)
            return null;
        if(func.getSenha().equals(senha))
            return func;
        else
            return null;
        
    }
    
    public boolean cadastrarFuncionario(Funcionario func){
        
        if(f.getFuncionario(func.getCPF()) != null)
            return false;
        
        return f.inserirFuncionario(func);
    
    }
}
