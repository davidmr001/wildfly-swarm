package org.wildfly.swarm.naming.runtime;

import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.jboss.as.naming.subsystem.NamingExtension;
import org.jboss.dmr.ModelNode;
import org.jboss.staxmapper.XMLElementReader;
import org.wildfly.swarm.container.runtime.AbstractParserFactory;

/**
 * @author Heiko Braun
 * @since 24/11/15
 */
public class NamingParserFactory extends AbstractParserFactory {
    @Override
    public Map<QName, XMLElementReader<List<ModelNode>>> create() {
        ParsingContext ctx = new ParsingContext();
        NamingExtension ext = new NamingExtension();
        ext.initializeParsers(ctx);
        return ctx.getParser();
    }
}