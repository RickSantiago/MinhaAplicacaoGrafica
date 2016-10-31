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
        gato = createSprite(R.mipmap.runningcat, 2, 4);
        gato.setScreenPercent(30, 20);
        gato.addAnimation(10, true, 0,1,2,3,4,5,6,7,8);
        gato.setScreenPercent(60,30);
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

//        if (AGInputManager.vrTouchEvents.screenClicked())
//        {
//            if(vrImagem.collide(AGInputManager.vrTouchEvents.getLastPosition()))
//            {
//                vrGameManager.setCurrentScene(1);
//                return;
//            }
//        }

//        if(estado == 0)
//        {
//            if (vrImagem.fadeEnded())
//            {
//                vrImagem.fadeOut(3000);
//                estado = 1;
//            }
//        }
//        else
//        {
//            if (vrImagem.fadeEnded())
//            {
//               vrGameManager.setCurrentScene(1);
//                return;
//            }
//        }

//        intervaloTempo.update();
//
//        if (intervaloTempo.isTimeEnded())
//        {
//            vrGameManager.setCurrentScene(1);
//            return;
//        }
//        if (AGInputManager.vrTouchEvents.screenClicked())
//        {
//            vrGameManager.setCurrentScene(1);
//            return;
//        }
//    }
    }
}
