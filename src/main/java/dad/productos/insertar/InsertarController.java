package dad.productos.insertar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import aed.productos.entities.Familia;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class InsertarController implements Initializable {
	
	// actions
	
	private EventHandler<ActionEvent> onBack;
	
	// model
	
	private BooleanProperty congelado = new SimpleBooleanProperty();
	private StringProperty deno = new SimpleStringProperty();
	private ObjectProperty<Familia> familia = new SimpleObjectProperty<>();
	private StringProperty observacion = new SimpleStringProperty();
	private DoubleProperty precio = new SimpleDoubleProperty();
	
	
	// view
	
    @FXML
    private CheckBox congeladoCheck;

    @FXML
    private TextField denoText;

    @FXML
    private ComboBox<Familia> familiaCombo;

    @FXML
    private TextField observacionText;

    @FXML
    private TextField precioText;

    @FXML
    private BorderPane view;
	
	public InsertarController() {
		try { 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InsertarView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO inicializar el controlador
	}
	
	public BorderPane getView() {
		return view;
	}

    @FXML
    void onCancelar(ActionEvent event) {
    	// TODO volver al menú sin guardar los cambios
    	System.out.println("cancelar");
    	if (onBack != null) onBack.handle(event);
    }

    @FXML
    void onGuardar(ActionEvent event) {
    	// TODO guardar los cambios y volver al menú
    	System.out.println("guardar");
    	if (onBack != null) onBack.handle(event);
    }
    
    public void setOnBack(EventHandler<ActionEvent> onBack) {
		this.onBack = onBack;
	}

}
