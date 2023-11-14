package dad.productos.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.productos.insertar.InsertarController;
import dad.productos.menu.MenuController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable {
	
	// controllers
	
	private MenuController menuController;
	private InsertarController insertarController;	
	
	// view
	
	@FXML
	private BorderPane view;

	public MainController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// instanciamos los controladores
		
		menuController = new MenuController();
		
		insertarController = new InsertarController();

		// inicialmnte mostramos la vista del menú
		
		view.setCenter(menuController.getView());

	}
	
	public BorderPane getView() {
		return view;
	}

}