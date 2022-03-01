package ru.anafro.patterns.behavioral.chainofresponsibility;

import ru.anafro.patterns.behavioral.chainofresponsibility.entities.*;

/**
 * Handler (see MaterialHandler)
 */
public class PaperFabric {
    private transient final MaterialHandler handler;

    public PaperFabric() {
        MaterialHandler logs2wood = new MaterialHandler() {
            @Override
            public Material handle(Material material) {
                return new Wood(((Logs) material).getVariety());
            }
        };

        MaterialHandler wood2cellulose = new MaterialHandler() {
            @Override
            public Material handle(Material material) {
                return new Cellulose();
            }
        };

        MaterialHandler cellulose2paper = new MaterialHandler() {
            @Override
            public Material handle(Material material) {
                return new Paper();
            }
        };

        logs2wood.setNext(wood2cellulose);
        wood2cellulose.setNext(cellulose2paper);

        handler = logs2wood;
    }

    public MaterialHandler getHandler() {
        return handler;
    }

    public Paper makePaper(Logs logs) {
        Wood wood = (Wood) handler.handle(logs);
        Cellulose cellulose = (Cellulose) handler.handle(wood);
        return (Paper) handler.handle(wood);
    }
}
