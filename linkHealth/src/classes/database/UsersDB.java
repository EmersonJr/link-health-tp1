package classes.database;

import java.io.IOException;
import java.util.ArrayList;

import classes.Distribuidor;
import classes.FormaDePagamento;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import classes.Usuario;
import classes.database.repositories.IUsersDBRepository;

public class UsersDB extends Database implements IUsersDBRepository {
    static String file = "./data/usuarios.txt";

    @Override
    public Usuario  findOne(int id) throws IOException, IOException {
        String[] usersRows = this.splitFileWrite(this.fileReader(file));

        for(String row: usersRows) {
            Usuario user = this.fromStringToUserObject(row);
            if(user.getId() == id) return user;
        }
        throw new UnsupportedOperationException("User not found");
    }

    @Override
    public ArrayList<Usuario> findAll() throws IOException {
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        String[] usersRows = this.splitFileWrite(this.fileReader(file));

        for(String row: usersRows) {
            Usuario user = this.fromStringToUserObject(row);
            users.add(user);
        }

        return users;
    }

    @Override
    public Usuario update(int id, Usuario updatedUsuario) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Usuario create(Usuario usuario) throws IOException {
        String data = "";
        int id = this.getNextId(file, 1);
        usuario.setId(id);
        if(usuario instanceof PessoaFisica){
            data = ((PessoaFisica)usuario).toString();
        } else if (usuario instanceof PessoaJuridica) {
            data = ((PessoaJuridica)usuario).toString();
        } else if (usuario instanceof Distribuidor){
            //TODO: HAHAHA
        }

        this.fileWriter(file, data);

        return usuario;
    }

    @Override
    public Usuario deleteUsuario(int id) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUsuario'");
    }

    @Override
    public Usuario fromStringToUserObject(String userSplited2) {
        String[] userSplited = this.splitRowString(userSplited2);
        int id = Integer.parseInt(userSplited[1]);
        String nome = userSplited[2];
        String senha = userSplited[3];
        ArrayList<String> address = new ArrayList<String>();

        for(String s: userSplited[4].split(";")) {
            address.add(s);
        }

        ArrayList<FormaDePagamento> formaDePagamento = new ArrayList<FormaDePagamento>(); // TODO: FIND A WAY TO STORE IT IN DATABASE (userSplited[5])

    
            if(userSplited[0].equals( "PESSOA_FISICA")){
                String cpf = userSplited[6];
                int idade = Integer.parseInt(userSplited[7]);
                boolean receita = userSplited[8].equals("true") ? true: false;
                

                PessoaFisica pf = new PessoaFisica(id, nome, senha, address, formaDePagamento, cpf, idade, receita);
                return pf;
            }
            else if(userSplited[0].equals( "PESSOA_JURIDICA")){

                String cnpj= userSplited[6];
                boolean isHospital = userSplited[7].equals("true") ? true: false;
                
                
                PessoaJuridica pj = new PessoaJuridica(id, nome, senha, address, formaDePagamento, cnpj, isHospital);
                return pj;
                
            }
            else if (userSplited[0].equals( "DISTRIBUIDOR")){
                return new PessoaFisica();

            }
                
            return new PessoaFisica();
        }
    }

