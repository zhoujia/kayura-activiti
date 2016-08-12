package org.kayura.activiti.web.controller;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.kayura.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseActivitiController extends BaseController {

	@Autowired
	protected IdentityService identityService;

	@Autowired
	protected TaskService taskService;

	@Autowired
	protected RepositoryService repositoryService;

	@Autowired
	protected FormService formService;

	@Autowired
	protected RuntimeService runtimeService;

	@Autowired
	protected HistoryService historyService;
}
