package classes;

public class Facade {
    public void rezervaMasa(int cod){
        MeseLibere meseLibere = new MeseLibere();
        if(meseLibere.verificaMasaLibera(cod)){
            Ospatar ospatar = new Ospatar();
            if(ospatar.masaDebarasata(cod)&& ospatar.masaAreServetele(cod)){
                System.out.println("Camera este gata");
            }else {
                System.out.println("Asteapta pana se face curat");}
        }else{
            System.out.println("Nu avem camere libere");
        }
    }
}
