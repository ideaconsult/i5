package net.idea.iuclid.cli;

import java.util.List;

import net.idea.opentox.cli.IIdentifiableResource;
import net.idea.opentox.cli.id.IIdentifier;

public interface IContainerClient {
	List<IIdentifiableResource<IIdentifier>> get(IIdentifier identifier) throws Exception;
}
