public class ServerManager {
    private ScheduleServer server;
	
	public ServerManager(){
		this.server = new ScheduleServer();
	}
	
	public void startServer(){
		server.startBooting();
	    server.readSystemConfigFile();
	    server.init();
	    server.initializeContext();
	    server.initializeListeners();
	    server.createSystemObjects();
        System.out.println("Start working......");
	}
	
	public void stopServer(){
        System.out.println("After work done.........");
		server.releaseProcesses();
	    server.destory();
	    server.destroySystemObjects();
	    server.destoryListeners();
	    server.destoryContext();
	    server.shutdown();
	}
}
