/*
 * Copyright (C) 2014 Arnaud
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.noony.mavenjfx8;

import fr.noony.mavenjfx8.utils.log.MainLogger;
import java.awt.Dimension;
import javafx.application.Application;
import javafx.stage.Stage;
import org.pmw.tinylog.Configurator;
import org.pmw.tinylog.Level;
import org.pmw.tinylog.writers.FileWriter;

/**
 *
 * @author Arnaud Hamon-Keromen
 */
public class MainDetaillled extends Application {

    public static final Dimension DEFAULT_RESOLUTION = new Dimension(800, 600);


     /*
     * @param stage primary stage
     */
    @Override
    public void start(Stage stage) {
        stage.show();
    }


    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configurator.defaultConfig()
                .writer(new FileWriter("Log" + System.currentTimeMillis() + ".txt"))
                .level(org.pmw.tinylog.Level.INFO)
                .activate();

        MainLogger.init();
        MainLogger.log(Level.WARNING, "Launching the application");
        launch(args);
    }

}
