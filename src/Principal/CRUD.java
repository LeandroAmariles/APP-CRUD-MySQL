package Principal;

import Modelo.*;
import Vista.*;
import Controlador.*;

public class CRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		JFCrud vistaF=new JFCrud();
		MP_DAO modelo=new MP_DAO();
		ControladorCRUD controla=new ControladorCRUD(vistaF, modelo);
		vistaF.setVisible(true);
}catch(Exception e) {
	e.printStackTrace();
}
	}

}
