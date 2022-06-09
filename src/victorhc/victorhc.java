/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package victorhc;

/**
 * create database victorhc;

use victorhc;

create table medico ( 
 idmedico int not null auto_increment,
 nome varchar(120), 
 especialidade int,
 crm int,
 cpf varchar(11),
 primary key(idmedico) );
 
create table paciente ( 
 idpaciente int not null auto_increment,
 nome varchar(120),
 cpf varchar(11),
 idade int, primary key(idpaciente));
 
create table consulta ( 
 idconsulta int not null auto_increment,
 id_medico int,
 id_paciente int,
 convenio varchar(120),
 primary key(idconsulta),
 FOREIGN KEY (id_medico) REFERENCES medico(idmedico),
 FOREIGN KEY (id_paciente) REFERENCES paciente(idpaciente));
 *
 * @author Victor
 */
public class victorhc {
    
}
