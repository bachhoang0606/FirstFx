import javafx.event.ActionEvent;
import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;

public class HelloController {

    private int count = 0;
    @FXML
    private Label lb;

    @FXML
    private Button btn;

    @FXML
    void pressAction(ActionEvent event) {
        lb.setText("Hello" + count++);
    }

}
