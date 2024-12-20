module mcboulderdash.temp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    exports mcboulderdash;
    exports mcboulderdash.components;
    exports mcboulderdash.types;

    opens assets.textures;
    opens assets.levels;
    opens assets.sounds;
}