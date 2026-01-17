package decorateur;

import composant.Boisson;

public abstract class DecorateurBoisson  extends Boisson {

   protected Boisson boisson;

   public DecorateurBoisson(Boisson boisson) {
      this.boisson = boisson;
   }

   @Override
   public abstract String getDescription();
}
