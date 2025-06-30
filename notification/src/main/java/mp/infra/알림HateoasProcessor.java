package mp.infra;

import mp.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 알림HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<알림>> {

    @Override
    public EntityModel<알림> process(EntityModel<알림> model) {
        return model;
    }
}
