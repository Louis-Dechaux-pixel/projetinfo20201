/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021;

/**
 *
 * @author ldechaux01
 */
public class Noeud {

    protected Force force;
    protected int id;

    public class noeud_simple extends Noeud {

        private double px;
        private double py;
    }

    public class Appui extends Noeud {

        protected Terrain attache;
        protected Terrain TT;

        public class Appui_simple extends Appui {

        }

        public class Appui_encastre extends Appui {
        }

        public class Appui_double extends Appui {
        }

        public class Appui_rouleau extends Appui {
        }
    }
}
