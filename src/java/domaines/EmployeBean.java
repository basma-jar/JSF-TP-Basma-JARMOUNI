/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaines;

import entities.Employe;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.ServiceEmploye;

/**
 *
 * @author BJarmouni
 */
@ManagedBean
@RequestScoped
public class EmployeBean {

    private Employe employe;
    private List<Employe> employes;
    private ServiceEmploye  se;

    /**
     * Creates a new instance of ServiceBean
     */
    public EmployeBean() {
        employe = new Employe();
        se = new ServiceEmploye();
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    
    public void onCreateAction(){
        se.create(employe);
        employe = new Employe();
    }

    public List<Employe> getEmployes() {
        if(employes == null)
            employes = se.getAll();
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
}
