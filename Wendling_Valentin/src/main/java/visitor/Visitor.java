package visitor;

import magasin.Catalogue;
import magasin.Articles;

public interface Visitor {

    public default void VisitorCatalogue(Catalogue catalogue){

    }
    public default void VisitorArticle(Articles article){

    }
}
