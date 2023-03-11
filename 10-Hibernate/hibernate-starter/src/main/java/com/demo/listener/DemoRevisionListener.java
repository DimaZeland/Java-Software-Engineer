package com.demo.listener;

import com.demo.entity.Revision;
import org.hibernate.envers.RevisionListener;

public class DemoRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
//        SecurityContext.getUser().getId()
        ((Revision) revisionEntity).setUsername("demo");
    }
}