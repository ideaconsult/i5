package net.idea.iuclid.cli;

import java.io.IOException;
import java.util.List;

import org.opentox.rest.RestException;

import net.idea.opentox.cli.IIdentifiableResource;
import net.idea.opentox.cli.id.IIdentifier;

public interface IQueryToolClient<Q extends AbstractPredefinedQuery> {
	List<IIdentifiableResource<IIdentifier>> executeQuery(Q queryID, String... params)
			throws RestException, IOException;
}
