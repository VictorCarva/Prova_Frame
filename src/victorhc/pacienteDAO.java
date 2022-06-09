/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package victorhc;

/**
 *
 * @author Victor
 */
public class pacienteDAO extends Conexao {
   public String cadastropaciente(Paciente paciente)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO paciente VALUES (NULL, '" + paciente.getNome() 
                    + "','" + paciente.getCpf() 
                    + "','" + paciente.getIdade() + "')";

            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }

}