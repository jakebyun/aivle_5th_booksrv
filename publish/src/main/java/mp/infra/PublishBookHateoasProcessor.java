package mp.infra;

import mp.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PublishBookHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PublishBook>> {

    @Override
    public EntityModel<PublishBook> process(EntityModel<PublishBook> model) {
        return model;
    }
}
