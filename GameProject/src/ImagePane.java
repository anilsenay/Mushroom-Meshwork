
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

class ImagePane extends Pane {

    ImagePane() {
    }

    public void print() {
        ImageView bg = new ImageView(new Image("images/emptyBg.png"));
        bg.setFitHeight(400);
        bg.setFitWidth(400);
        this.getChildren().add(bg);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                this.getChildren().add(main.images[i][j]);
                main.images[i][j].setX((j * 100));
                main.images[i][j].setY((i * 100));
                if (main.images[i][j].direction.equals("Starter")) {
                    main.mushroom = new mushroomImage(new Image("images/mushroom.png"), (j * 100) + 25, (i * 100) + 25);
                }
            }
        }
        this.getChildren().add(main.mushroom); // to be top of pipes as image, this should be added in pane later.
    }
}