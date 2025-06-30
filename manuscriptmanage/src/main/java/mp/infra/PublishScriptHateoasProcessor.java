package mp.infra;

import mp.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PublishScriptHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PublishScript>> {

    @Override
    public EntityModel<PublishScript> process(
        EntityModel<PublishScript> model
    ) {
        return model;
    }
}
