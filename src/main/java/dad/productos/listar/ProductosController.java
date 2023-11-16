package dad.productos.listar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class ProductosController implements Initializable {

    @FXML
    private TableColumn<?, ?> codigoColumn;

    @FXML
    private TableColumn<?, ?> congeladoColumn;

    @FXML
    private TableColumn<?, ?> denoColumn;

    @FXML
    private TableColumn<?, ?> familiaColumn;

    @FXML
    private TableColumn<?, ?> observaColumn;

    @FXML
    private TableColumn<?, ?> precioColumn;

    @FXML
    private TableView<?> productsTable;

    @FXML
    private BorderPane view;
    
	public ProductosController() {
		try { 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ProductosView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	public BorderPane getView() {
		return view;
	}
	
    @FXML
    void onBack(ActionEvent event) {

    }

}
