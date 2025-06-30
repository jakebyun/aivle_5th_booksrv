package mp.infra;

import mp.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class WriterHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Writer>> {

    @Override
    public EntityModel<Writer> process(EntityModel<Writer> model) {
        return model;
    }
}
