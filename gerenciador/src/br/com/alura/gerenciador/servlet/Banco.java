package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ItalicAction;

public class Banco {
		
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1; 
	
	public static Integer getChaveSequencial() {
		return chaveSequencial;
	}
	public static void setChaveSequencial(Integer chaveSequencial) {
		Banco.chaveSequencial = chaveSequencial;
	}
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial++);
		empresa1.setNome("Santander");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Bradesco");
		lista.add(empresa1);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		lista.add(empresa);
		
	}
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId()==id) {
				it.remove();
			}
		}
	}
	
	public Empresa buscaEmpresaPelaId(Integer id) {
		for(Empresa empresa : lista) {
			if(empresa.getId()==id) {
				return empresa;
			}
		}
		return null;
	}
	
}
