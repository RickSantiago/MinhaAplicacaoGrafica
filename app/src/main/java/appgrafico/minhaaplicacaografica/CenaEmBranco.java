package appgrafico.minhaaplicacaografica;

import appgrafico.minhaaplicacaografica.AndGraph.AGGameManager;
import appgrafico.minhaaplicacaografica.AndGraph.AGInputManager;
import appgrafico.minhaaplicacaografica.AndGraph.AGScene;
import appgrafico.minhaaplicacaografica.AndGraph.AGScreenManager;
import appgrafico.minhaaplicacaografica.AndGraph.AGSoundManager;
import appgrafico.minhaaplicacaografica.AndGraph.AGSprite;
import appgrafico.minhaaplicacaografica.AndGraph.AGTimer;

/**
 * Created by RickSantiago on 24/10/2016.
 */
public class CenaEmBranco extends AGScene {
    AGTimer intervaloTempo = null;
    AGSprite vrImagem = null;
    AGSprite vrAjuda = null;
    int estado = 0;
    AGSprite gato = null;

    public CenaEmBranco(AGGameManager gerente) {
        super(gerente);
    }

    @Override
    public void init() {
        //criar uma cena com o fundo amarelo
        this.setSceneBackgroundColor(1, 1, 1);
        gato = createSprite(R.mipmap.run, 5, 2);
        gato.setScreenPercent(30, 20);
        gato.addAnimation(15, true, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        gato.setScreenPercent(60, 40);
        gato.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight - (AGScreenManager.iScreenHeight / 4));

    }

    @Override
    public void restart() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {

        gato.vrPosition.setX(gato.vrPosition.getX() + 5);

        if(gato.vrPosition.getX() > AGScreenManager.iScreenWidth + gato.getSpriteWidth()/2)
        {
            gato.vrPosition.setX(-gato.getSpriteWidth()/2);
        }

        if (AGInputManager.vrTouchEvents.screenClicked() || AGInputManager.vrTouchEvents.backButtonClicked())
        {
            vrGameManager.setCurrentScene(0);
            return;
        }
    }
}
