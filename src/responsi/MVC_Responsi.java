package responsi;

public class MVC_Responsi {
        ViewResponsi vA = new ViewResponsi();
        ModelResponsi mA = new ModelResponsi();
        ModelPinjam mP = new ModelPinjam();
        ModelTampil mT = new ModelTampil();
        ViewDaftar vD = new ViewDaftar();
        ViewPinjam vP = new ViewPinjam();
        ViewPinjam vEdit = new ViewPinjam();
        ViewHome vH = new ViewHome();
        ViewTampil vT = new ViewTampil();
        ViewAboutUs vAU = new ViewAboutUs();
         
        
                ControllerResponsi cA = new ControllerResponsi(vA, mA, vD, vH);
                ControllerHome cH = new ControllerHome(vH,vP,vT,vAU);
                ControllerPinjam cP = new ControllerPinjam(mP,vP);
                ControllerTampil tP = new ControllerTampil(mT,vT);
                
      
        

}
